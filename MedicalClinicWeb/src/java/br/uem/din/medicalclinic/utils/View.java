package br.uem.din.medicalclinic.utils;

public enum View {
    
    Create("create"),
    Edit("edit"),
    Delete("delete"),
    Details("details"),
    Index("index"),
    MainMenu("/index");
    
    private final String pageName;
    
    View(String pageName) {
        this.pageName = pageName;
    }
    
    @Override
    public String toString() {
        return this.pageName;
    }
    
}
