package task1;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task1 {

    /**
     * Есть ли разница между $("h1 div"); и $("h1").$("div");
     * - может ли привести к тому что, поиск найдёт разные элементы?
     *
     * выражение $("h1 div") звучит как "Найти первый элемент div, являющийся потомком элемента h1"
     * выражение $("h1").$("div") звучит как "Найти первый элемент h1. Затем найти в нем div-потомок"
     *
     * Следовательно, разница есть:
     *
     * Если первый найденный h1 НЕ содержит в себе div, а другой содержит, то $("h1 div") проигнорирует первый h1 и
     * найдет div дальше, а $("h1").$("div") - не найдет.
     * - содержит в себе div, и другой h1 тоже содержит, оба селектора найдут div
     */

    @Test
    public void task1() {

        // путь к файлу index.html из папки task1
        open("file://C:/Users/User/IdeaProjects/homework_11/src/test/java/task1/index.html");

        System.out.println("h1 div:      " + $("h1 div").getText());
        System.out.println("$h1.$div:    " + $("h1").$("div").getText());
    }
}
