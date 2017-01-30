# clj-marta

clj-marta is a very thin wrapper around the [MARTA APIs](http://www.itsmarta.com/app-developer-resources.aspx).


## Project Goals

### TODO
 - [x] Find rail schedule by line
 - [x] Find rail schedule by station
 - [x] Find bus schedule by stop
 - [x] Find bus stop by route
 - [ ] Find routes by stop
 - [ ] Add projected arrival/departure time based on historical trends
 - [ ] Create `with-credentials` wrapper for non-env credential flexibility

## Project Maturity

clj-marta is *very* young.


## Artifacts

clj-marta artifacts are [released to Clojars](https://clojars.org/itg/clj-marta). If you are using Maven, add the following repository
definition to your `pom.xml`:

``` xml
<repository>
  <id>clojars.org</id>
  <url>http://clojars.org/repo</url>
</repository>
```

### The Most Recent Release

With Leiningen:

    [itg/clj-marta "1.0.0-SNAPSHOT"]

With Maven:

    <dependency>
      <groupId>itg</groupId>
      <artifactId>clj-marta</artifactId>
      <version>1.0.0-SNAPSHOT</version>
    </dependency>

## Documentation & Examples

``` clojure
(ns some-project.core
    (:require [itg.clj-marta.rail.core :as rail]
              [itg.clj-marta.bus.core :as bus]))

;; Details for lines, stations, timepoints, routes and stops are available
;; in the respective rail and bus globals

;; Get a snapshot of the current rail system schedule
(rail/get-rail-schedule)

;; Get the schedule for a specific station
(rail/get-rail-schedule-by-station "LINDBERGH STATION")

;; Get the schedule for a specific line
(rail/get-rail-schedule-by-line "RED")


;; Get stops by a specific timepoint
(bus/get-stops-by-timepoint "Glenwood & Moreland")

;; Get stop by route number
(bus/get-stop-by-route "189")
```


## Supported Clojure versions

clj-marta is built from the ground up for Clojure 1.8.0 and up.


## Continuous Integration Status

[![Continuous Integration status](https://secure.travis-ci.org/csmith-cb/clj-marta.png)](http://travis-ci.org/csmith-cb/clj-marta)

## Development

clj-marta uses [Leiningen
2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against supported
Clojure versions using

    lein all test

Then create a branch and make your changes on it. Once you are done
with your changes and all tests pass, submit a pull request on GitHub.



## License

clj-marta is licensed under the [MIT license](https://opensource.org/licenses/MIT).
