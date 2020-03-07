package com.mangostreet.mangostreetserspring.controller;

import com.mangostreet.mangostreetserspring.VO.ResultVO;
import com.mangostreet.mangostreetserspring.dataobject.Note;
import com.mangostreet.mangostreetserspring.dataobject.NoteImage;
//import com.mangostreet.mangostreetserspring.entity.NoteEntity;
import com.mangostreet.mangostreetserspring.form.NoteForm;
import com.mangostreet.mangostreetserspring.service.NoteImageService;
import com.mangostreet.mangostreetserspring.service.NoteService;
import com.mangostreet.mangostreetserspring.service.impl.NoteServiceImpl;
import com.mangostreet.mangostreetserspring.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("note")
public class NoteController {
    @Autowired
    private NoteServiceImpl noteService;

    @GetMapping
    public ResultVO getAllNote(){
        Page page = noteService.getNoteList();
        return ResultVOUtil.success(page);
    }

//    @GetMapping("{id}")
//    public NoteEntity getNote(@PathVariable("id")String id){
//        return noteService.getNote(id);
//    }
//
//    @PostMapping
//    public NoteEntity insertNote(@RequestBody NoteEntity noteEntity){
//        return noteService.insertNote(noteEntity);
//    }
//
//    @PatchMapping
//    public NoteEntity updateUser(@RequestBody NoteEntity noteEntity){
//        return noteService.updateNote(noteEntity);
//    }

//    @DeleteMapping("{id}")
//    public boolean deleteNote(@PathVariable("id")String id){
//        noteService.deleteNote(id);
//        return true;
//    }
}