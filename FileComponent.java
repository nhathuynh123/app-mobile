package Composite;

import java.util.Date;

public class FileComponent implements BaseComponent {
	private int FileGUID ;
	private int DocumentGUID;
	private String FileName;
	private Date Date_Created;
	private long Size;
	
	
	
	public FileComponent(int fileGUID, int documentGUID, String fileName, Date date_Created, long size) {
		super();
		FileGUID = fileGUID;
		DocumentGUID = documentGUID;
		FileName = fileName;
		Date_Created = date_Created;
		Size = size;
	}

	@Override
	public void showProperty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return this.FileName;
	}
	
	@Override
	public long totalSize() {
		
		return this.Size;
	}

	public int getFileGUID() {
		return FileGUID;
	}

	public void setFileGUID(int fileGUID) {
		FileGUID = fileGUID;
	}

	public int getDocumentGUID() {
		return DocumentGUID;
	}

	public void setDocumentGUID(int documentGUID) {
		DocumentGUID = documentGUID;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public Date getDate_Created() {
		return Date_Created;
	}

	public void setDate_Created(Date date_Created) {
		Date_Created = date_Created;
	}

	public long getSize() {
		return Size;
	}

	public void setSize(long size) {
		Size = size;
	}
}
