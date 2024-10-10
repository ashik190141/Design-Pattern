public class client {
    public static void main(String[] args) {
        fileconverter f=new fileconverter();
        f.openPdf("doc", "math.doc");
        f.openPdf("pdf", "Physics.pdf");
        f.openPdf("excel", "Database.xl");
        f.openPdf("xml", "Android.xml");
    }
}
