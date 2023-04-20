/**
 * Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
 * “Название книги” Имя Отчество Фамилия автора
 */

public class Main {
    public static void main(String[] args) {
        String[] booksAndWriters = new String[] {
                "book1", "author1",
                "book2", "author2",
                "book3", "author3",
                "book4", "author4",
                "book5", "author5",
        };
        System.out.println("Исходный массив:");
        for (String text: booksAndWriters){
            System.out.println(text);
        }

        String[] notes = new String[booksAndWriters.length/2];
        String note;

        for (int i=0; i<booksAndWriters.length; i+=2) {
            note = booksAndWriters[i] + " " + booksAndWriters[i + 1];
            notes[i / 2] = note;
        }

        System.out.println();
        System.out.println("Видоизмененный массив:");
        for (String text: notes){
            System.out.println(text);
        }
    }

}