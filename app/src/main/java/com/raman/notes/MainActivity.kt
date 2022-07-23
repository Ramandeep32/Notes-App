package com.raman.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list_view=findViewById<ListView>(R.id.list_view)
        val item=ArrayList<Note>()
        item.add(Note(
            R.mipmap.ic_note,
            "Algorithm",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/algorithm.pdf?alt=media&token=8c40597b-3797-48bc-afae-e0167fae3ab5","https://drive.google.com/file/d/1Mwq3EQEOJN_0lNHXbFjioTrrjB4KlY2l/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Abstract Data Type",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/1C4KcnBEOeatS4do26WqKaNGeyBTs7SN8/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "C++",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))
        item.add(Note(
            R.mipmap.ic_note,
            "Notes",
            "https://firebasestorage.googleapis.com/v0/b/notes-f784d.appspot.com/o/chapter3.pdf?alt=media&token=cf09a771-a40f-464c-a962-40791a2b67c0","https://drive.google.com/file/d/13QG0o9p6ByX0stM3x6nbye3wxr_yulOK/view?usp=sharing","View","Download"
        ))




        val adapter=NoteAdapter(this,item)
        list_view.adapter=adapter
    }
}