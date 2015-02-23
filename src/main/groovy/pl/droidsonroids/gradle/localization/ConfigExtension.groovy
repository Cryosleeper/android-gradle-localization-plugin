package pl.droidsonroids.gradle.localization

import org.apache.commons.csv.CSVStrategy

import java.text.Normalizer

/**
 * Plugin configuration extension. See README.md for details
 * @author koral--
 */
class ConfigExtension {
    boolean allowNonTranslatableTranslation = false
    boolean allowEmptyTranslations = false
    boolean escapeApostrophes = true
    boolean escapeQuotes = true
    boolean escapeNewLines = true
    boolean convertTripleDotsToHorizontalEllipsis = true
    boolean escapeSlashes = true
    TagEscapingStrategy tagEscapingStrategy = TagEscapingStrategy.IF_TAGS_ABSENT
    Normalizer.Form normalizationForm = Normalizer.Form.NFC
    String defaultColumnName = 'default'
    String nameColumnName = 'name'
    String translatableColumnName = 'translatable'
    String commentColumnName = 'comment'
    File csvFile
    String csvFileURI
    String csvGenerationCommand
    File xlsFile
    String xlsFileURI
    File outputDirectory
    String sheetName
    List<String> ignorableColumns = []
    CSVStrategy csvStrategy
    String outputFileName = 'strings.xml'
    String outputIndent = '  '
    boolean skipInvalidName
    boolean skipDuplicatedName
}
