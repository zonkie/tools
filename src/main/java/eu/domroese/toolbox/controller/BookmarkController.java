package eu.domroese.toolbox.controller;


import eu.domroese.toolbox.model.Bookmark;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class BookmarkController {

    @GetMapping("/bookmarks/list")
    public String listBookmarks(Model model){
        //@Todo: get Bookmarks from DB
        ArrayList<Bookmark> Bookmarks = new ArrayList<>();
        Bookmarks.add(new Bookmark("http://www.hawesko.de/","Hawesko Live"));
        model.addAttribute("bookmarks", Bookmarks);

        model.addAttribute("pageTitle", "Bookmarks");
        return "bookmarks/list";
    }

    @GetMapping("/bookmarks/add")
    public String addBookmark(Model model){
        //@TODO: Add Bookmark to DB and redirect to list
        model.addAttribute("pageTitle", "Add Bookmark");
        model.addAttribute("bookmark", new Bookmark());
        return "bookmarks/add";
    }

    @PostMapping("/bookmark/add")
    public String addBookmarkSubmit(@ModelAttribute Bookmark bookmark){

        return "bookmarks/added";
    }
}
