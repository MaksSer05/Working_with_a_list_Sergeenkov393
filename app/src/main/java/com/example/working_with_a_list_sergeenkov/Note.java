package com.example.working_with_a_list_sergeenkov;

public class Note
    //Sergeenkov Maksim393
{
    public String title;
    public String content;

    Note(String title, String content)
    {
        this.title = title;
        this.content = content;
    }

    public String toString() { return title; }
}
