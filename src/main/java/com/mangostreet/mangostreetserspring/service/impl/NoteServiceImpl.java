package com.mangostreet.mangostreetserspring.service.impl;

import com.mangostreet.mangostreetserspring.dataobject.Note;
import com.mangostreet.mangostreetserspring.dataobject.User;
//import com.mangostreet.mangostreetserspring.entity.NoteEntity;
import com.mangostreet.mangostreetserspring.repository.NoteRepository;
import com.mangostreet.mangostreetserspring.repository.UserRepository;
import com.mangostreet.mangostreetserspring.repository.UserinfoRepository;
import com.mangostreet.mangostreetserspring.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Page getNoteList(){
        PageRequest pageReques= PageRequest.of(0,1);   //获取第1页的两条记录
        Page<Note> page=noteRepository.findAll(pageReques);

        return page;
    }

//    public NoteEntity getNote(String id){
//        return noteRepository.findById(id).get();
//    }
//
//    public NoteEntity insertNote(NoteEntity noteEntity){
//        return noteRepository.save(noteEntity);
//    }
//
//    public NoteEntity updateNote(NoteEntity noteEntity){
//        NoteEntity tUserEntity1=noteRepository.findById(noteEntity.getNoteId()).get();
//        if(tUserEntity1==null){
//            return null;
//        }
//        tUserEntity1.setNoteTitle(noteEntity.getNoteTitle());
//        tUserEntity1.setNoteContent(noteEntity.getNoteContent());
//        return noteRepository.save(tUserEntity1);
//    }
//
//    public boolean deleteNote(String id){
//        try{
//            noteRepository.deleteById(id);
//        }catch(Exception e){
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }

}
