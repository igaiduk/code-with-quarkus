package com.amazon.java.mentorship.services;

import com.amazon.java.mentorship.entities.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LabelService {

    private final static List<Label> LABELS = new ArrayList<>();

    public LabelService (){
        LABELS.add(new Label("Sport"));
        LABELS.add(new Label("Nutrition"));
    }

    public void addLabel(Label label)
    {
      LABELS.add(label);
    }

    public void deleteLabel(Label label)
    {
        LABELS.remove(label);
    }

    public List<Label> getAllLabels()
    {
        return LABELS;
    }
}
