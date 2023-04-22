/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

package Java_GB_HomeWork.Lesson_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hw2 {
    public static void main(String[] args) throws IOException, NullPointerException {
        System.out.print("\033[H\033[2J");

        BufferedReader inputNames = new BufferedReader(new FileReader("names.txt"));
        String line = "";
        while (line != null) {
            line = inputNames.readLine();
            FileWriter writer = new FileWriter("logAdditional.txt", true);
            String fullRows = parser(line);
            writer.write(fullRows.toString());
            writer.flush();
            writer.close();
        }
        inputNames.close();
    }

    public static String parser(String inputLine) {
        StringBuilder rows = new StringBuilder();
        rows.append(inputLine.replaceAll(" ", "")
                .replaceAll("\"фамилия\":\"", "Студент ")
                .replaceAll("\",\"оценка\":\"", " получил ")
                .replaceAll("\",\"предмет\":\"", " по предмету ")
                .replaceAll("\"", ".")).append("\n");
        return rows.toString();
    }
}
