////////////////////////////////////////////////////////////////////
// Roberto Mariano Doroftei 2111031
// Marco Giacon 2123537
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class Roman {
    private final int num;
    private final String roman;

    public Roman(int num, String roman) {
        this.num = num;
        this.roman = roman;
    }

    public int getNum() { return num; }
    public String getRoman() { return roman; }
}