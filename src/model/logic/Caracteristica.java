package model.logic;

public class Caracteristica {


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caracteristica other = (Caracteristica) obj;
		if (CLASE_VEHI == null) {
			if (other.CLASE_VEHI != null)
				return false;
		} else if (!CLASE_VEHI.equals(other.CLASE_VEHI))
			return false;
		if (FECHA_HORA == null) {
			if (other.FECHA_HORA != null)
				return false;
		} else if (!FECHA_HORA.equals(other.FECHA_HORA))
			return false;
		if (INFRACCION == null) {
			if (other.INFRACCION != null)
				return false;
		} else if (!INFRACCION.equals(other.INFRACCION))
			return false;
		return true;
	}

	// todos los parametros de una multa
	int OBJECTID;
	String FECHA_HORA;
	String MEDIO_DETE;
	String CLASE_VEHI;
	String TIPO_SERVI;
	String INFRACCION;
	String DES_INFRAC;
	String LOCALIDAD;

	// inicializa la multa
	public Caracteristica(int id, String fecha, String medio, String clase, String servicio, String infraccion,
			String desInfraccion, String localidad) {
		OBJECTID = id;
		FECHA_HORA = fecha;
		MEDIO_DETE = medio;
		CLASE_VEHI = clase;
		TIPO_SERVI = servicio;
		INFRACCION = infraccion;
		DES_INFRAC = desInfraccion;
		LOCALIDAD = localidad;
	}

	public int getId()
	{
		return OBJECTID;
	}

	public String getFecha()
	{
		return FECHA_HORA;
	}

	public String getMedio()
	{
		return MEDIO_DETE;
	}

	public String getClaseVehiculo()
	{
		return CLASE_VEHI;
	}

	public String getServicio()
	{
		return TIPO_SERVI;
	}

	public String getInfraccion()
	{
		return INFRACCION;
	}

	public String getDesInfraccioin()
	{
		return DES_INFRAC;
	}

	public String getLocalidad()
	{
		return LOCALIDAD;
	}

	public String toString() {
		return "Caracteristica [OBJECTID=" + OBJECTID + 
		", FECHA_HORA=" + FECHA_HORA + 
		", TIPO_SERVI=" + TIPO_SERVI + 
		", CLASE_VEHI" + CLASE_VEHI +
		", INFRACCION=" + INFRACCION + 
		", LOCALIDAD=" + LOCALIDAD + "]";
	}

}
