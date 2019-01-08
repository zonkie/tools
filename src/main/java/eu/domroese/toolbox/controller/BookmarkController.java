package eu.domroese.toolbox.controller;


import eu.domroese.toolbox.Model.Bookmark;
import eu.domroese.toolbox.Repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class BookmarkController {

    @Autowired
    private BookmarkRepository bookmarkRepository;
    private Bookmark bookmark;
    private BindingResult bindingResult;
    private Model model;

    @GetMapping("/bookmark")
    public String listBookmarks(Model model, @RequestParam(required = true, defaultValue = "0") String added) {

        model.addAttribute("newBookmark", new Bookmark());
        model.addAttribute("added", added);

        //@Todo: get Bookmarks from DB
        ArrayList<Bookmark> Bookmarks = (ArrayList<Bookmark>) bookmarkRepository.findAll();
        model.addAttribute("bookmarks", Bookmarks);

        model.addAttribute("pageTitle", "Bookmarks");
        return "bookmark/list";
    }

    //@GetMapping("/bookmark/add")
    //public String addBookmark(Model model) {
    //    //@TODO: Add Bookmark to DB and redirect to list
    //    model.addAttribute("pageTitle", "Add Bookmark");
    //    model.addAttribute("bookmark", new Bookmark());
    //    return "bookmark/add";
    //}

    @RequestMapping(value = "/bookmark/add", method = RequestMethod.POST)
    public String addBookmarkSubmit(@ModelAttribute(value="newBookmark") Bookmark newBookmark, BindingResult bindingResult, Model model) {
        bookmarkRepository.save(newBookmark);
        return "redirect:/bookmark?added=1";
    }
}
