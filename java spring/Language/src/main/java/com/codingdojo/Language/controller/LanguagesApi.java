package com.codingdojo.Language.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.Language.models.Language;
import com.codingdojo.Language.services.LanguageService;



//@RestController
//public class LanguageApi {
//  private final LanguageService languageService;
//  public LanguageApi(LanguageService languageService){
//      this.languageService = languageService;
//  }
//  @RequestMapping("/api/languages")
//  public List<Language> index() {
//      return languageService.allLanguages();
//  }
//  
//  @RequestMapping(value="/api/languages", method=RequestMethod.POST)
//  public Language create(@RequestParam(value="title") String name, @RequestParam(value="description") String creator, @RequestParam(value="language") String version) {
//      Language language = new Language(name, creator, version);
//      return languageService.createLanguage(language);
//  }
//  
//  @RequestMapping("/api/languages/{id}")
//  public Language show(@PathVariable("id") Long id) {
//      Language language = languageService.findLanguage(id);
//      return language;
//  }
//  @RequestMapping(value="/api/languages/{id}", method=RequestMethod.PUT)
//  public Language update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang) {
//      Language language = languageService.updateLanguage(id, title, desc, lang);
//      return language;
//  }
//  
//  @RequestMapping(value="/api/languages/{id}", method=RequestMethod.DELETE)
//  public void destroy(@PathVariable("id") Long id) {
//      languageService.deleteLanguage(id);
//  }
//
//}

@Controller
public class LanguagesApi {
    private final LanguageService LanguageService;
    
    public LanguagesApi(LanguageService LanguageService) {
        this.LanguageService = LanguageService;
    }
      
    @RequestMapping("/languages")
    public String index(Model model) {
        List<Language> Languages = LanguageService.allLanguages();
        model.addAttribute("Languages", Languages);
        return "/languages/index.jsp";
    }
    @RequestMapping("/languages/new")
    public String newLanguage(@ModelAttribute("Language") Language Language) {
        return "/languages/new.jsp";
    }
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("Language") Language Language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/new.jsp";
        } else {
            LanguageService.createLanguage(Language);
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/{id}")
    public String show(@PathVariable("id") Long id,Model model) {
      Language Language = LanguageService.findLanguage(id);
      model.addAttribute("Language", Language);
      return "/languages/show.jsp";
    }
    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language Language = LanguageService.findLanguage(id);
        model.addAttribute("Language", Language);
        return "/languages/edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("Language") Language Language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            LanguageService.updateLanguage(Language);
            return "redirect:/languages";
        }
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        LanguageService.deleteLanguage(id);
        return "redirect:/languages";
    }
}
