//Object Class
public class Guru {
    //variabel
    private int nip;
    private String nama;
    private String mapel;
    private String status;

	public int getNip() {
		return this.nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getMapel() {
		return this.mapel;
	}

	public void setMapel(String mapel) {
		this.mapel = mapel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


    //Constructor
    public Guru() {
        nip = 0;
        nama = "null";
        mapel = "null";
        status = "null";
    }

    //Construstor Parameter
    public Guru(int np, String n, String m,String s) {
        nip = np;
        nama = n;
        mapel =  m;
        status = s;
    }

    //Getter
    //Setter
    //Method
    public void print() {
    System.out.println("NIP = " +nip);
    System.out.println("Nama = " +nama);
    System.out.println("Mapel = " +mapel);
    System.out.println("Status = " +status);
    }
}
