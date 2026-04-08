package re.ss04it210.bai2.service;


import org.springframework.stereotype.Service;

@Service
public class MenuService {

    public String getMenu(String category) {
        return "Menu loai: " + category;
    }
}