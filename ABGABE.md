# Puzzleroom · Abgabe der Gruppe

Moodle-Gruppe: C

Füllt diese Datei vor dem Release aus. Verwendet hier GitHub-Benutzernamen. Die Zuordnung zu vollständigen Namen reicht ihr in Moodle ein.

## Beiträge pro Person

Ergänzt eine Zeile pro Person, in Gruppe G also fünf. Verlinkt jeweils ein selbst erstelltetes Issue und einen selbst eröffneten Pull Request mit einem eigenen Arbeitscommit.

| GitHub-Benutzername | Eigener Beitrag | Eigenes Issue | Eigenes PR |
| --- | --- | --- | --- |
| @RamzyYoussef | Implementierung & Unit-Tests für Einbahn (`FieldOneWay`), Eis (`FieldIce`) und `fastmove` (`CommandFastmove`) | https://github.com | https://github.com |
| @SarahKha1 | Fork-Verwaltung, Review & Abstimmung | (Issue-Link ergänzen) | (PR-Link ergänzen) |
| @(Mitglied 3) | Review & Prüfung | (Issue-Link ergänzen) | (PR-Link ergänzen) |
| @(Mitglied 4) | Review & Prüfung | (Issue-Link ergänzen) | (PR-Link ergänzen) |

## Aufgaben und Tests

| Aufgabe | Status | Neue Testfälle und erwartete Ergebnisse | Review-Link |
| --- | --- | --- | --- |
| A · Einbahn | Erledigt | `oneWayFieldAllowedDirection` (auf `>` nach rechts gehen gelingt, Endposition `(1,3)`) und `oneWayFieldBlockedDirection` (auf `>` nach links gehen liefert `false`, Position bleibt `(1,2)`) | https://github.com |
| B · Eis | Erledigt | `iceFieldStopsOnFirstWalkableField` (`#o@@ x#` -> rutscht bis `(1,4)` vor das Ziel) und `iceFieldStopsBeforeWall` (`#o@@#x#` -> rutscht bis `(1,3)` vor die Wand) | https://github.com |
| C · fastmove | Erledigt | `fastmoveReachesFinish` (`fastmove d r r u` -> erreicht Ziel in 4 Schritten bei `(1,3)`) und `fastmoveBlockedStopsAtLastValidPosition` (`fastmove d d r` -> erster Zug gelingt `(2,1)`, zweiter trifft Wand -> `PuzzleRoomInvalidMoveException`) | https://github.com |

## Zusammenarbeit

Wir haben die Gruppe C in zwei Arbeitsteams aufgeteilt und die Aufgaben A (Einbahn), B (Eis) und C (`fastmove`) über eigene Issues (`#1`, `#3`, `#5`) und Feature-Branches (`feature/einbahn`, `feature/eis`, `feature/fastmove`) entwickelt. Nach der Implementierung der Spiellogik wurden jeweils die zugehörigen JUnit-4-Tests ergänzt, Merge-Konflikte in `FieldFactory` und `FieldTest` sauber aufgelöst und alle Änderungen über Pull Requests (`#2`, `#4`, `#6`) in `main` zusammengeführt.

## Offene Punkte

Keine bekannt
