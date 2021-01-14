package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class PageHeader {

    public PageHeader open() {
        Selenide.open("/index.php");
        return this;
    }

    public PageHeader search(String produto) {
        $("#search_query_top").setValue("Blouse");
        $("#searchbox button").click();
        return this;
    }
}