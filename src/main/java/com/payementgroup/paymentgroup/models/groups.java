package com.payementgroup.paymentgroup.models;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String groupName;
    private String entryPass;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Group_users", joinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<users> User ;

    public groups(Long id, String groupName, String entryPass){
        this.id = id;
        this.groupName = groupName;
        this.entryPass = entryPass;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getGroupName(){
        return groupName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public String getEntryPass(){
        return entryPass;
    }

    public void setEntryPass(String entryPass){
        this.entryPass = entryPass;
    }

    public String ToString(){
        return "Groups["
            + "id : " +id
            + " groupName : " +groupName
            + " entryPass : " +entryPass+"]";
    }
}
