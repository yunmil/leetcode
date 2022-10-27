//Code Signal Question

String[] AddBorder(String[] picture) {
    
    int n = picture[0].length(); //len of string (all same)
    int tb = n + 2; //len of top and bottom border (full of ***...)
    int blen = picture.length + 2; //length of return array
    
    String b[] = new String[blen]; 
        
    //fill array b 
    for (int i=0; i<blen; i++) {
        if (i==0 || i==blen-1) {
            b[i] = "*".repeat(tb); //remember! 
        }
        else {
            b[i] = "*" + picture[i-1] + "*";
        }
    }
    
    return b; 
}
