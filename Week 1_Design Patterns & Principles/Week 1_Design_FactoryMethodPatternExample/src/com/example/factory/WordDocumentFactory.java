package com.example.factory;

import com.example.document.Document;
import com.example.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
