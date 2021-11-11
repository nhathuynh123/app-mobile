package Composite;

import java.util.Date;
import java.util.List;

import DBConnect.DocumentDataImp;

public class DocumentComponent implements BaseComponent{
	
	private int DocumentGUID; 
	private int ParentDocumentGUID;
	private List<FileComponent> fileComponent;
	private String DocumentName;
	private Date Date_Created;
	private long totalSize;
	
	
	
	public DocumentComponent(int documentGUID, int parentDocumentGUID, List<FileComponent> fileComponent,
			String documentName, Date date_Created, long totalSize) {
		super();
		DocumentGUID = documentGUID;
		ParentDocumentGUID = parentDocumentGUID;
		this.fileComponent = fileComponent;
		DocumentName = documentName;
		Date_Created = date_Created;
		this.totalSize = totalSize;
	}
	@Override
	public void showProperty() {
		DocumentDataImp docData = new DocumentDataImp();
		List<DocumentComponent> lst= docData.getDataByParentDocumentGUID(this.DocumentGUID);
		System.out.println("Tập Các File: ");
		for(FileComponent item: this.fileComponent) {
			System.out.println("GUID : " + item.getFileGUID());
			System.out.println("Đường dẫn : " + this.DocumentName + "\\" + item.getFileName());
			System.out.println("Dung lượng: "+ item.getSize());
		}
		System.out.println("Tập các Folder : ");
		for(DocumentComponent item: lst) {
			System.out.println("GUID :" + item.getDocumentGUID());
			System.out.println("Đường dẫn : " + this.DocumentName + "\\" + item.getDocumentName());
			System.out.println("Dung lượng: "+ item.getTotalSize());
		}
		
		
	}
	@Override
	public long totalSize() {
		DocumentDataImp docData = new DocumentDataImp();
		List<DocumentComponent> lst= docData.getDataByParentDocumentGUID(this.DocumentGUID);
		long total = 0;
		for(FileComponent item: this.fileComponent) {
			total += item.totalSize();
		}
		for(DocumentComponent item: lst) {
			total += item.getTotalSize();
		}
		return total;
	}
	@Override
	public String getName() {
		return this.DocumentName;
	}
	public int getDocumentGUID() {
		return DocumentGUID;
	}
	public void setDocumentGUID(int documentGUID) {
		DocumentGUID = documentGUID;
	}
	public int getParentDocumentGUID() {
		return ParentDocumentGUID;
	}
	public void setParentDocumentGUID(int parentDocumentGUID) {
		ParentDocumentGUID = parentDocumentGUID;
	}
	public List<FileComponent> getFileComponent() {
		return fileComponent;
	}
	public void setFileComponent(List<FileComponent> fileComponent) {
		this.fileComponent = fileComponent;
	}
	public String getDocumentName() {
		return DocumentName;
	}
	public void setDocumentName(String documentName) {
		DocumentName = documentName;
	}
	public Date getDate_Created() {
		return Date_Created;
	}
	public void setDate_Created(Date date_Created) {
		Date_Created = date_Created;
	}
	public long getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}
	
	
	
	
	
}
