package enumeracoes.entites;

import java.util.ArrayList;
import java.util.List;


public class Worker {

        private String name;
        private WorkerLevel level;
        private Double baseSalary;

        private Department department;

        private List<HourContract> contracts = new ArrayList<>();

        public Worker(){

        }

    public Worker(Double baseSalary, Department department, WorkerLevel level, String name) {
        this.baseSalary = baseSalary;
        this.department = department;
        this.level = level;
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract(HourContract contract){
            contracts.add(contract);
    }

    public void removeContract(HourContract contract){
            contracts.remove(contract);
    }





}

