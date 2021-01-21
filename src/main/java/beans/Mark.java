package beans;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tblMarks")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 255, nullable = false)
    String name;

    @OneToMany(mappedBy = "mark", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Model> models;

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String str = "";

        for(Model model: models){
            str += model.name + ", ";
        }
        return "Mark{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", models=" + str +
                '}';
    }

    public Mark(String name) {
        this.name = name;
        this.models = new ArrayList<Model>();
    }
    public Mark(){
        this.models = new ArrayList<Model>();
    }
}
