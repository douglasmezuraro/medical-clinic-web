package br.uem.din.medicalclinic.utils;

public enum CrudAction {
    
    Index("index"),
    Create("create"),
    Details("details"),
    Edit("edit"),
    Delete("delete");
    
    private String pageName;
    
    CrudAction(String pageName) {
        this.pageName = pageName;
    }
    
    @Override
    public String toString() {
        return this.pageName;
    }
    
}
