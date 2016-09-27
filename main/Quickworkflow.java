/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import analysis.concept.Iter;
import org.processmining.models.graphbased.directed.petrinet.Petrinet;
import org.processmining.plugins.plg.generator.log.PLGLogGeneratorConfiguration;
import org.processmining.plugins.plg.generator.process.PLGProcessGeneratorConfiguration;
import org.processmining.plugins.plg.logic.models.PlgDependencyGraph;
import org.processmining.plugins.plg.logic.models.distributions.ProbabilityDistribution;
import org.processmining.plugins.plg.models.PlgProcess;

/**
 *
 * @author Tahereh Koohi (tahere.koohi@gmail.com)
 */
public class Quickworkflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PLGProcessGeneratorConfiguration processConfiguration = new PLGProcessGeneratorConfiguration(
                4, ProbabilityDistribution.uniformDistributionFactory(),
                4, ProbabilityDistribution.uniformDistributionFactory(),
                80, 5, 80, 5, 5,
                3,
                ProbabilityDistribution.uniformDistributionFactory(),
                ProbabilityDistribution.uniformDistributionFactory());
        PLGLogGeneratorConfiguration logConfiguration = new PLGLogGeneratorConfiguration(10, 0, 0);

        PlgProcess process = new PlgProcess();
        org.processmining.plugins.plg.logic.models.Process p = new org.processmining.plugins.plg.logic.models.Process("Test process");
        System.out.println("Process randomization...");
        p.randomize(processConfiguration);
        process.setProcess(p);

        //process to dependencyGraph
        PlgDependencyGraph net = process.getProcess().getDependencyGraph();

        
        //process to Petrinet
        Petrinet pnet = process.getProcess().getPetriNet();
        
        //calling of concept analysis
        Iter itration = new Iter(pnet);
    }
    
}
