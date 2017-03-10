package com.kamino.mygallery.file;

public final class FileInfo {
	//�ļ���
	public String name;
	//�ļ���·�� 
	public String path;
	public long size;
	//�Ƿ���һ���ļ���
	public boolean isDirectory;
	public int subCount;
	public long lastModified;
	public boolean canRead;
	public boolean canWrite;
	public boolean isHidden;
	public long id;
	public int imageTextureId = -1;
	//�ļ�������
	public int nameTextureId = -1;
	//ͼƬ�Ƿ��Ѿ����غ���
	public boolean imageDecode;
	//���ļ���ʱ�� �ļ��Ŵ�ı���
	public float imageRatio = 1.5F;
	//�ļ�������
	public FileType type;

	public int getImageTextureId() {
		return imageTextureId;
	}

	public void setImageTextureId(int imageTextureId) {
		this.imageTextureId = imageTextureId;
	}
}