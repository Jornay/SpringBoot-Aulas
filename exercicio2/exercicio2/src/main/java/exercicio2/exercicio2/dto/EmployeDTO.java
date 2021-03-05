package exercicio2.exercicio2.dto;

public class EmployeDTO {
    
    private Long id;

    private String name;

    private String cargo;

    public EmployeDTO() {
    }
    
    public EmployeDTO(Long id, String name, String cargo) {
        this.id = id;
        this.name = name;
        this.cargo = cargo;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
