package com.jnorthr
public class Finder {
    def keys = ["implementation","testImplementation","groovy","compile","jarLib","runtimeOnly","classpath","ivy","runtime","testCompile", "testRuntime","fred","asciidoclet","compileOnly","url","id"];
    //def lines;
    //String ln;
    boolean ok = false;          
    def lines;
    
    public boolean hasComment(String ln) 
    { 
        ok=false; 
        if (ln.startsWith('//') ) { ok = true; } 
        return ok; 
    } // end of
    
    public void searcher(def fn)
    {
        def file = new File(fn);
        lines = file.readLines();
        
        lines.eachWithIndex() {e, ix -> 
            print "... ->";
            def ln = e.trim().toString();
            if (hasComment(ln))  { print "||"; } 
            println e;
        } // end of each    
    } // end of method

    // --------------------------------
    public static void main(String[] args) {
        println "--- start job ---"
        Finder e = new Finder();
        e.searcher("/home/jnorthr/Dropbox/Projects/Constructor/build.gradle");
        println "--- end of job ---"
    } // end of main

} // end of class

