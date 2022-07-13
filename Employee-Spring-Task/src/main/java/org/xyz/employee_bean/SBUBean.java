package org.xyz.employee_bean;

public class SBUBean {
	private int sbuid;
	private String sbuName;
	private String sbuHead;

	public int getSbuid() {
		return sbuid;
	}

	public void setSbuid(int sbuid) {
		this.sbuid = sbuid;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBUBean [sbuid=" + sbuid + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
}