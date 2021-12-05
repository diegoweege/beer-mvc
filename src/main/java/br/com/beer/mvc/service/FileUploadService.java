package br.com.beer.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.beer.mvc.request.UploadFileRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FileUploadService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${client.file-upload.url}")
    private String url;

    public String execute(final byte[] image) {
        String urlImage = "";
        final UploadFileRequest uploadFileRequest = UploadFileRequest.builder()
            .file(image)
            .build();
        try {
            urlImage = restTemplate.postForObject(url, uploadFileRequest, String.class);

        } catch (Exception e) {
            log.error("Erro ao tentar fazer upload da imagem no serviço externo.", e);
            return urlImage;
        }

        return urlImage;
    }
}