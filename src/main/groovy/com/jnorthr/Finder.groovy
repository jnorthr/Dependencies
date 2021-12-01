//package com.jnorthr
class Finder {

    def keys = ["implementation","testImplementation","groovy","compile","jarLib","runtimeOnly","classpath","ivy","runtime","testCompile", "testRuntime","fred","asciidoclet","compileOnly","url","id"];
    //def lines;
    String ln;
    boolean ok = false;          

    
    public boolean hasComment(String ln) 
    { 
        ok=false; 
        if (ln.startsWith('//') ) { ok = true; } 
        return ok; 
    } // end of
    
    public void search()
    {
        def fn = "/home/jnorthr/Dropbox/Projects/Constructor/build.gradle";
        def file = new File(fn);
        def lines = file.readLines();        
        lines.each{String line ->
            print "... ->"
            ln = line.trim();
            if hasComment(ln) { print "||"; }
            println line;
        } // end of each
        
    } // end of method

    // --------------------------------
    static void main(String[] args) {
        println "--- start job ---"
        Finder e = new Finder();
        e.search();
        println "--- end of job ---"
    } // end of main

} // end of class
//------------------------