import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
        String str;
        private static Singleton instance=null;
    private Singleton(){
        str="Hello I am a singleton! Let me say hello world to you";
    }
    public static Singleton getSingleInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}