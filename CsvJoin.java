package cs2110;

import java.io.IOException;
import java.util.ArrayList;

public class CsvJoin {
    //TODO Make a method that asserts validity of tables

    /**
     * Load a table from a Simplified CSV file and return a row-major list-of-lists representation.
     * The CSV file is assumed to be in the platform's default encoding. Throws an IOException if
     * there is a problem reading the file.
     */
    public static Seq<Seq<String>> csvToList(String file) throws IOException{
        /**
         * Implement this method with a FileReader, which will assume the platform’s default encoding,

         * and a Scanner, as you learned in discussion section. It should read each line of the CSV,

         * then it should separate each line into tokens delimited by commas using String.split(",", -1)

         * The -1 argument will enable you to correctly handle empty columns at the end of a row.
         */
        throw new UnsupportedOperationException();

    }

    /**
     * Return the left outer join of tables `left` and `right`, joined on their first column. Result
     * will represent a rectangular table, with empty strings filling in any columns from `right`
     * when there is no match. Requires that `left` and `right` represent rectangular tables with at
     * least 1 column.
     */
    public static Seq<Seq<String>> join(Seq<Seq<String>> left, Seq<Seq<String>> right){

        throw new UnsupportedOperationException();
    }


    static void main(String leftFileName, String rightFileName){

    }

}
