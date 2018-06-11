package br.uem.din.medicalclinic.utils;

public enum CrudAction {
    
    Create("create"),
    Edit("edit"),
    Delete("delete"),
    Details("details"),
    Index("index");
    
    private String pageName;
    
    CrudAction(String pageName) {
        this.pageName = pageName;
    }
    
    @Override
    public String toString() {
        return this.pageName;
    }
    
}
