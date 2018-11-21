package eu.domroese.toolbox.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BookmarkController {

    private static final ArrayList<String> Bookmarks = new ArrayList<String>();

    @GetMapping("/bookmarks/list")
    public String listBookmarks(Model model){
        //@Todo: get Bookmarks from DB
        this.Bookmarks.add("http://www.hawesko.de");
        model.addAttribute("Bookmarks", this.Bookmarks);
        return "bookmarks/list";
    }

    @GetMapping("/bookmarks/add")
    public String addBookmark(Model model){
        //@TODO: Add bookmark to DB and redirect to list
        return "bookmarks/add";
    }
}
