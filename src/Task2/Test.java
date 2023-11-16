package Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Chapter> chapters = new ArrayList<>();
        List<Publication> publications = new ArrayList<>();
        String[] magazines = {"Khoa Học", "Điện Tử", "Học Trò", "Làm Đẹp"};
        String[] authors = {"Nguyễn Ngọc Ngạn", "Nguyễn Thúc Thùy Tiên", "Nguyễn Phi Long", "Nam Cao"};
        String[] names = {"Sống đẹp", "Dark nhân tâm", "Tôi tài giỏi bạn tài xỉu", "Học làm người"};
        for (int i = 0; i < 3; i++) {
            Chapter c = new Chapter("Mục " + i + 1, i + 1);
            chapters.add(c);
        }
        for (int i = 0; i < 3; i++) {
            Publication magazine = new Magazine(
                    "Tạp Chí " + magazines[new Random().nextInt(magazines.length)],
                    new Random().nextInt(200),
                    new Random().nextInt(2000, LocalDate.now().getYear()),
                    authors[new Random().nextInt(authors.length)],
                    new Random().nextInt(1, 5),
                    names[new Random().nextInt(names.length)]
            );
            Publication referenceBook = new ReferenceBook(
                    "Sách tham khảo " + magazines[new Random().nextInt(magazines.length)],
                    new Random().nextInt(200),
                    new Random().nextInt(2000, LocalDate.now().getYear()),
                    authors[new Random().nextInt(authors.length)],
                    new Random().nextInt(1, 5),
                    names[new Random().nextInt(names.length)],
                    createRandomChapters(chapters)
            );
            publications.add(magazine);
            publications.add(referenceBook);
        }
        BookStore bookStore = new BookStore("NLU", "HCM", publications);
        System.out.println("Total: " + bookStore.totalPriceAllPublications());
        System.out.println("Longest Chapter: " + bookStore.findReferenceBookWithLongestChapter());
        System.out.println(bookStore);
    }

    public static List<Chapter> createRandomChapters(List<Chapter> chapters) {
        Collections.shuffle(chapters);
        List<Chapter> list = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(chapters.size()); i++) {
            Chapter chapter = chapters.get(i);
            list.add(chapter);
        }
        return list;
    }
}
