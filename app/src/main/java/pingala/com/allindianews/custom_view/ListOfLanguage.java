package pingala.com.allindianews.custom_view;

/**
 * Created by Habeeb on 12/29/2016.
 */

public class ListOfLanguage {

    String name;
    String image;

    public ListOfLanguage(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
