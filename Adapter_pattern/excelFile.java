public class excelFile implements advanceFileSystem{

    @Override
    public void doc(String fileName) {
        
    }

    @Override
    public void excel(String fileName) {
        System.out.println("Excel file open and file Name is "+fileName);
    }

    @Override
    public void xml(String fileName) {
        
    }
    
}
