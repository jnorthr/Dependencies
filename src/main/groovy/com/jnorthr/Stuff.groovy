def stuff = ["compile","compileOnly"]
println "--------\n--- start job ---"

def finder() {
    stuff.eachWithIndex{e, ix -> 
        println "${ix} = "+e+" size="+e.size();
    } // end of each
    return ix;
} // end of finder

finder();
println "--------\n--- end of job ---"
