package analysis.concept;

import java.util.Collection;
import java.util.Iterator;
import org.processmining.models.graphbased.directed.petrinet.Petrinet;

/**
 * experiment of workflow.
 * 
 * A "workflow" component represents the diagram of an automated flow of a process.
 * In workflow we have typically Relation component.
 * so for implementing class should provide a constructor with a single 
 * argument of type "Relation" which creates a graph for that relation.
 * and "Relation" there is some classification of "Relation". such as "join Relation" See the
 * "meet Relation" and etc. see documentation of the classes implementing it
 * for details.
 * @author Tahereh Koohi (tahere.koohi@gmail.com)
 * @version 0.01
 *
 */
public class Iter {

    public Iter(Petrinet pnet) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Returns the join Relation concept contained in the collection
     *
     * @param concepts the concepts whose least upper bound shall be computed.
     * @return the least upper bound of the concepts 
     */
    public Concept join(Collection<Concept> concepts) {
        return null;
    }

    /**
     * Returns the meet Relation concept contained in the collection
     *
     * @param concepts the concepts whose greatest lower bound shall be
     * computed.
     * @return the greatest lower bound of the concepts contained in
     * <code>concepts</code>.
     */
    public Concept meet(Collection<Concept> concepts) {
        return null;
    }

    /**
     * Returns the number of Relation that contains all components.
     * <p>
     *
     * @param components the set of components from which the concept shall be
     * computed.
     * @return the concept computed from components.
     */
    public Concept conceptFromComponents(Collection<Comparable> components) throws IllegalArgumentException {
        return null;
    }

    /**
     * Returns the greatest concept that contains 
     * @param attributes the set of attributes from which the concept shall be
     * computed.
     * @return the concept computed from attributes.
     */
    public Concept conceptFromAttributes(Collection<Comparable> attributes) throws IllegalArgumentException {
        return null;
    }

    /**
     * Returns the concept that contains all components.
     * @return the top relation.
     */
    public Concept top() {
        return null;
    }

    /**
     * @return the bottom relation.
     */
    public Concept bottom() {
        return null;
    }

    /**
     * Returns an iterator over the lower neighbors of component
     * @param concept the concept whose lower neighbors shall be computed.
     * @return an iterator over the lower neighbors 
     */
    public Iterator<Concept> lowerNeighbors(Concept concept) {
        return null;
    }

    /**
     * Returns an iterator over the upper neighbors 
     * @param concept the concept whose upper neighbors shall be computed.
     * @return an iterator over the upper neighbors
     */
    public Iterator<Concept> upperNeighbors(Concept concept) {
        return null;
    }

    /**
     * Returns an iterator over all concepts of this workflow.
     * @param trav the desired traversal.
     * @return an iterator over all concepts of this workflow.
     */
    public Iterator<Concept> conceptIterator(Traversal trav) {
        return null;
    }

    /**
     * Returns an iterator over all edges of this 
     * @param trav the desired traversal.
     * @return an iterator over all edges of this workflow.
     */
    public Iterator<Integer> edgeIterator(Traversal trav) {
        return null;
    }

    /**
     * Returns an iterator over pairs of neighboring
     * @param supp the minimal support
     * @param conf the minimal confidence
     * @param diff the maximal difference between of attributes
     */
    public Iterator<Integer> violationIterator(int supp, float conf, int diff) {
        return null;
    }
}
