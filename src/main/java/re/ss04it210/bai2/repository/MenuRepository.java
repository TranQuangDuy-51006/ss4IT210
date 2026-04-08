package re.ss04it210.bai2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MenuRepository {

    public String getMenu(String category) {
        return "Menu DB loai: " + category;
    }
}