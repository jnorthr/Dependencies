package com.jnorthr;

class DependencyFinder {

    static boolean ExamineName(String name) 
    {
      println("... This is a gradle file:${name}");
      def str = name.toLowerCase();
      return str.endsWith("build.gradle");
    } // end of method 



    boolean process()
    {
        def fn = "/home/jnorthr/Dropbox/Projects/Constructor/build.gradle";
        def file = new File(fn);
        def lines = file.readLines()
        def ln="";
        boolean yn = ExamineName(fn);

        lines.each { String line ->
            ln = line.trim();
 
            if (ln.size() > 0)
            {   
                yn = ln.startsWith("//");
                if (!yn)
                {
                    println ln;
                } // end of if
            } // end of if
         } // end of lines
  
    } // end of method

    // --------------------------------
    static void main(String[] args) {
        println "--- start job ---"
        DependencyFinder e = new DependencyFinder();
        e.process();
        println "--- end of job ---"
    } // end of main

} // end of class
//------------------------
