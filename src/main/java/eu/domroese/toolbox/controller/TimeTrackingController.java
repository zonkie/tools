package eu.domroese.toolbox.controller;


import eu.domroese.toolbox.Model.OttProject;
import eu.domroese.toolbox.Model.OttTime;
import eu.domroese.toolbox.Repository.OttProjectRepository;
import eu.domroese.toolbox.Repository.OttTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TimeTrackingController {

    @Autowired
    private OttProjectRepository ottProjectRepository;

    @Autowired
    private OttTimeRepository ottTimeRepository;

    @GetMapping("/timetracking")
    public String timeTrackingOverview(Model model){
        Iterable<OttProject> projects = ottProjectRepository.findAll();

        //@TODO: get current active entry (endDate = null)
        // Pass current active to front

        model.addAttribute("projects", projects);
        model.addAttribute("pageTitle", "TimeTracking Overview");
        return "timetracking/index";
    }

    @PostMapping("/timetracking/add")
    public String timeTrackingAdd(Model model){
        //@TODO: set all wit hend=null to current_date
        // add new Row with start = now() and end = null

        return "redirect:/timetracking";
    }

    @GetMapping("/timetracking/day")
    public String timeTrackingByDay(Model model) {

        Iterable<OttTime> times = ottTimeRepository.findAll();
        Iterable<OttProject> projects = ottProjectRepository.findAll();

        model.addAttribute("times", times);
        model.addAttribute("projects", projects);
        model.addAttribute("pageTitle", "TimeTracking by Day");

        return "timetracking/day";
    }
}
