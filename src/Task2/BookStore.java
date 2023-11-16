package Task2;

import java.util.*;
import java.util.stream.Collectors;

import static Task2.Type.REFERENCE_BOOK;


public class BookStore {
    private String name;
    private String address;
    private List<Publication> publications;

    public BookStore(String name, String address, List<Publication> publications) {
        this.name = name;
        this.address = address;
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "BookStore{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", publications=" + publications + "\n}";
    }

    public double totalPriceAllPublications() {
        return publications.stream().mapToDouble(Publication::getPrice).sum();
    }

    public Publication findReferenceBookWithLongestChapter() {
        Publication max = null;
        for (Publication publication : publications) {
            if (publication.getType() == REFERENCE_BOOK) {
                if (max == null) {
                    max = publication;
                } else {
                    if (publication.isLongestChapter(max)) {
                        max = publication;
                    }
                }
            }
        }
        return max;
    }

    public boolean findMagazinebyName(String name) {
        return publications.stream().anyMatch(p -> p.isSameNameMagazine(name));
    }

    public List<Publication> getMagazineByYear(int year) {
        return publications.stream().filter(p -> p.getYearPublishing() == year).collect(Collectors.toList());
    }

    public List<Publication> sortByTitleThenByYearPublishing() {
        List<Publication> list = new ArrayList<>(publications);
        list.sort(Comparator.comparing(Publication::getTitle).thenComparing((o1, o2) -> o2.getYearPublishing() - o1.getYearPublishing()));
        return list;
    }

    public Map<Integer, Integer> getPublicationCountByYear() {
        Map<Integer, Integer> map = new HashMap<>();
        publications.forEach(p -> map.put(p.getYearPublishing(), map.getOrDefault(p.getYearPublishing(), 0) + 1));
        return map;
    }

}
