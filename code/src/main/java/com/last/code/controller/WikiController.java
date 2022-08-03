package com.last.code.controller;

import com.last.code.model.WikiDTO;
import com.last.code.service
        .WikiService;
import com.last.code.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("wiki")

public class WikiController {
    @Autowired
    private WikiService wikiService;
@Autowired
private UserService userService;


    // Select all
    @GetMapping("/list")
    public List<WikiDTO> wikiList() {

        return wikiService.WikiList();
} // wikiList

    // Select one
    @GetMapping("/detail")
    public WikiDTO wikiDetail(@RequestParam("wiki_pno") int wiki_pno) {

return wikiService.wikiDetail(wiki_pno);
    } // wikiDetail

    // Insert
    @PostMapping("/insert")
    public int wikiInsert(@RequestBody WikiDTO dto, @AuthenticationPrincipal String user_pno) {
        int userPno = Integer.parseInt(user_pno);

        String userNick = userService.selectUserNick(userPno);
        dto.setUser_nick(userNick);
        dto.setWiki_user_fno(userPno);

        return wikiService.wikiInsert(dto);
    } // wikiInsert

    // Update
    @PostMapping("/update")
public int wikiUpdate(@RequestBody WikiDTO dto) {

return wikiService.wikiUpdate(dto);
    } // wikiUpdate

    // Delete
    @GetMapping("/delete")
public int wikiDelete(@RequestParam("wiki_pno") int wiki_pno){

return WikiService.WikiDelete(wiki_pno);
    } // wikiDelete

} // class