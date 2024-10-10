public class fileconverter implements file{
    fileadapter fileAdapter=new fileadapter();
    @Override
    public void openPdf(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("doc")){
            fileAdapter.openPdf(fileType, fileName);
        }
        else if(fileType.equalsIgnoreCase("pdf"))
            System.out.println("Pdf file is open and file name is "+fileName);
        else if(fileType.equalsIgnoreCase("excel")){
            fileAdapter.openPdf(fileType, fileName);
        }
        else{
            fileAdapter.openPdf(fileType, fileName);
        }
    }
    
}
