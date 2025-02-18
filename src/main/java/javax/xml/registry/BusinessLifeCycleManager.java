/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.xml.registry;

import java.util.*;
import javax.xml.registry.infomodel.*;

/**
 * The BusinessLifeCycleManager interface, which is exposed by the Registry Service, implements the
 * life cycle management functionality of the Registry as part of a business level API.
 * Note that there is no authentication information provided, because the
 * Connection interface keeps that state and context on behalf of the client.
 *
 * @see LifeCycleManager
 * @author Farrukh S. Najmi
 */
public interface BusinessLifeCycleManager extends LifeCycleManager {

    /**
	 * Saves the specified Organizations.
	 * <p>If the object is not in the registry, it is created in the registry.
	 * If it already exists in the registry and has been modified, its
	 * state is updated (replaced) in the registry.
	 *
	 * <p>Partial commits are allowed. Processing stops on first SaveException encountered.
     *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param organizations the Collection of Organization objects to be saved
	 *
	 * @return a BulkResponse containing the Collection of keys for those objects that were
	 * saved successfully and any SaveException that was encountered in case of partial commit
	 *
	 * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse saveOrganizations(Collection organizations) throws JAXRException;

   /**
    * Saves the specified Services.
	* <p>If the object is not in the registry, it is created in the registry.
	* If it already exists in the registry and has been modified, its
	* state is updated (replaced) in the registry.
	*
	* <p>Partial commits are allowed. Processing stops on first SaveException encountered.
    *
    * <DL><DT><B>Capability Level: 0 </B></DL>
    *
    * @param services the Collection of Service objects to be saved
    *
    * @return a BulkResponse containing the Collection of keys for those objects that were
    * saved successfully and any SaveException that was encountered in case of partial commit
    *
    * @throws JAXRException if the JAXR provider encounters an internal error
    */
    BulkResponse saveServices(Collection services) throws JAXRException;

    /**
     * Saves the specified ServiceBindings.
     * <p>If the object is not in the registry, it is created in the registry.
     * If it already exists in the registry and has been modified, its
     * state is updated (replaced) in the registry.
     *
     * <p>Partial commits are allowed. Processing stops on first SaveException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param bindings the Collection of ServiceBinding objects to be saved
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * saved successfully and any SaveException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse saveServiceBindings(Collection bindings) throws JAXRException;

    /**
     * Saves the specified Concepts.
     * <p>If the object is not in the registry, it is created in the registry.
     * If it already exists in the registry and has been modified, its
     * state is updated (replaced) in the registry.
     *
     * <p>Partial commits are allowed. Processing stops on first SaveException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param concepts the Collection of Concept objects to be saved
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * saved successfully and any SaveException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse saveConcepts(Collection concepts) throws JAXRException;

    /**
     * Saves the specified ClassificationScheme instances.
     * <p>If the object is not in the registry, it is created in the registry.
     * If it already exists in the registry and has been modified, its
     * state is updated (replaced) in the registry.
     *
     * <p>Partial commits are allowed. Processing stops on first SaveException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param schemes the Collection of ClassificationScheme objects to be saved
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * saved successfully and any SaveException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse saveClassificationSchemes(Collection schemes) throws JAXRException;

    /**
     * Saves the specified Association instances.
     * <p>If the object is not in the registry, it is created in the registry.
     * If it already exists in the registry and has been modified, its
     * state is updated (replaced) in the registry.
     *
     * <p>Partial commits are allowed. Processing stops on first SaveException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param associations the Collection of Association objects to be saved
     * @param replace If set to true, the specified associations replace any existing associations
     * owned by the caller. If set to false, the specified associations are saved, while
     * any existing associations not being updated by this call are preserved.
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * saved successfully and any SaveException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse saveAssociations(Collection associations, boolean replace) throws JAXRException;


    /**
     * Deletes the organizations corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param organizationKeys the Collection of keys for the Organization objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
     BulkResponse deleteOrganizations(Collection organizationKeys) throws JAXRException;

    /**
     * Deletes the services corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param serviceKeys the Collection of keys for the Service objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse deleteServices(Collection serviceKeys) throws JAXRException;

    /**
     * Deletes the ServiceBindings corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param bindingKeys the Collection of keys for the ServiceBinding objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse deleteServiceBindings(Collection bindingKeys) throws JAXRException;

    /**
     * Deletes the Concepts corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param conceptKeys the Collection of keys for the Concept objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse deleteConcepts(Collection conceptKeys) throws JAXRException;

    /**
     * Deletes the ClassificationSchemes corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param schemeKeys the Collection of keys for the ClassificationScheme objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse deleteClassificationSchemes(Collection schemeKeys) throws JAXRException;

    /**
     * Deletes the Associations corresponding to the specified Keys.
     * <p>Partial commits are allowed. Processing stops on first DeleteException encountered.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param associationKeys the Collection of keys for the Association objects to be deleted
     *
     * @return a BulkResponse containing the Collection of keys for those objects that were
     * deleted successfully and any DeleteException that was encountered in case of partial commit
     *
     * @throws JAXRException if the JAXR provider encounters an internal error
     */
    BulkResponse deleteAssociations(Collection associationKeys) throws JAXRException;


	/**
	 * Confirms this Association by the User associated with the caller.
	 * The User must be the owner of the sourceObject or the targetObject
	 * in this association.
	 * 
	 * <ul>
	 * <li>If the Association is intramural, this method does nothing and returns.</li>
	 * <li>If the Association is extramural and already confirmed (isConfirmed returns true), this method does nothing and returns.</li>
	 * <li>If the Association is extramural and not already confirmed, this method
	 * confirms the association for the User associated with the caller.</li>
	 * </ul>
	 * <p>
	 * The details of confirming an extramural Association are registry-specific. For UDDI and ebXML registries,
	 * the registry-specific details are described in the JAXR specification.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param assoc the Association object to be confirmed
	 *
     * @throws JAXRException if the JAXR provider encounters an internal error
     * @throws InvalidRequestException if the User is not the owner of the
     * sourceObject or the targetObject
	 */
	public void confirmAssociation(Association assoc) throws JAXRException, InvalidRequestException;

	/**
	 * Undoes a previous confirmation of this Association by the User associated with the caller.
	 * The User must be the owner of the sourceObject or the targetObject
	 * in this association.
	 *
	 * <ul>
	 * <li>If the Association is intramural, this method does nothing and returns.</li>
	 * <li>If the Association is extramural and already confirmed (isConfirmed returns true), this method unconfirms it for the requestor.</li>
	 * <li>If the Association is extramural and not already confirmed, this method does nothing and returns.</li>
	 * </ul>
	 * <p>
	 * The details of unconfirming an extramural Association are registry-specific. For UDDI and ebXML registries,
	 * the registry-specific details are described in the JAXR specification.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param assoc the Association object to be unconfirmed
	 *
     * @throws JAXRException if the JAXR provider encounters an internal error
     * @throws InvalidRequestException if the User is not the owner of the
     * sourceObject or the targetObject
	 */
	public void unConfirmAssociation(Association assoc) throws JAXRException, InvalidRequestException;
}
