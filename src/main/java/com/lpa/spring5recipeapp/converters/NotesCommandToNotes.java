package com.lpa.spring5recipeapp.converters;

import com.lpa.spring5recipeapp.commands.NotesCommand;
import com.lpa.spring5recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {
    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand notesCommand) {
        return null;
    }
}
