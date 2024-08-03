package com.example.factory;

import com.example.document.Document;
import com.example.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

