package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Task2.Type.MAGAZINE;
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
        return "BookStore{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", publications=" + publications +
                "\n}";
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

    public Publication findMagazinebyName(String name) {
        return publications.stream()
                .filter(publication -> publication.getType() == MAGAZINE)
                .filter(publication -> publication.isSameNameMagazine(name))
                .findFirst()
                .orElse(null);
    }

    public List<Publication> getMagazineByName(int year) {
        return publications.stream()
                .filter(publication -> publication.getYearPublishing() == year)
                .collect(Collectors.toList());
    }

    public List<Publication> sortByTitleThenByYearPublishing() {
        List<Publication> list = new ArrayList<>(publications);
//        list.sort(Comparator.comparing((Publication p) -> p.getChapter().getTitle()).thenComparing(p -> -p.getYearPublishing()));
//        list.sort((o1, o2) -> {
//            int byTitle = o1.getChapter().getTitle().compareTo(o2.getChapter().getTitle());
//            int byYear = o1.getYearPublishing() - o2.getYearPublishing();
//            if (byTitle == 0) {
//                return -byYear;
//            }
//            return byTitle;
//        });
        return list;
    }

    public Map<Integer, Integer> getPublicationCountByYear() {
        Map<Integer, Integer> map = new HashMap<>();
        publications.forEach(p -> map.put(p.getYearPublishing(), map.getOrDefault(p.getYearPublishing(), 0) + 1));
        return map;
    }

}
