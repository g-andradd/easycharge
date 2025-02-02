package br.com.alura.srtch.service;

import br.com.alura.srtch.form.ClienteForm;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ArquivoJSON implements Arquivo {

    @Override
    public List<ClienteForm> arquivo(String arquivo) {
        List<ClienteForm> rcda;
        try {
            Reader reader = new FileReader(arquivo);
            ObjectMapper mapper = new ObjectMapper();

            rcda = mapper.readValue(reader, new TypeReference<>() {
            });
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
        return rcda;
    }
}
