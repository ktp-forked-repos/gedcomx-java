/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.rs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import org.gedcomx.Gedcomx;
import org.gedcomx.links.SupportsLinks;
import org.gedcomx.rt.GedcomxConstants;

import javax.ws.rs.HttpMethod;
import java.net.URI;

/**
 * @author Ryan Heaton
 */
public class SourceDescriptionsState<E> extends GedcomxApplicationState<Gedcomx> {

  public SourceDescriptionsState(URI discoveryUri) {
    this(discoveryUri, loadDefaultClient());
  }

  public SourceDescriptionsState(URI discoveryUri, Client client) {
    this(ClientRequest.create().accept(GedcomxConstants.GEDCOMX_JSON_MEDIA_TYPE).build(discoveryUri, HttpMethod.GET), client, null);
  }

  public SourceDescriptionsState(ClientRequest request, Client client, String accessToken) {
    super(request, client, accessToken);
  }

  @Override
  protected SourceDescriptionsState newApplicationState(ClientRequest request, Client client, String accessToken) {
    return new SourceDescriptionsState(request, client, accessToken);
  }

  @Override
  protected Gedcomx loadEntity(ClientResponse response) {
    return response.getClientResponseStatus() == ClientResponse.Status.OK ? response.getEntity(Gedcomx.class) : null;
  }

  @Override
  public SourceDescriptionsState ifSuccessful() {
    return (SourceDescriptionsState) super.ifSuccessful();
  }

  @Override
  public SourceDescriptionsState head() {
    return (SourceDescriptionsState) super.head();
  }

  @Override
  public SourceDescriptionsState get() {
    return (SourceDescriptionsState) super.get();
  }

  @Override
  public SourceDescriptionsState delete() {
    return (SourceDescriptionsState) super.delete();
  }

  @Override
  public SourceDescriptionsState put(Gedcomx e) {
    return (SourceDescriptionsState) super.put(e);
  }

  @Override
  protected SupportsLinks getScope() {
    return getEntity();
  }

  @Override
  public SourceDescriptionsState readNextPage() {
    return (SourceDescriptionsState) super.readNextPage();
  }

  @Override
  public SourceDescriptionsState readPreviousPage() {
    return (SourceDescriptionsState) super.readPreviousPage();
  }

  @Override
  public SourceDescriptionsState readFirstPage() {
    return (SourceDescriptionsState) super.readFirstPage();
  }

  @Override
  public SourceDescriptionsState readLastPage() {
    return (SourceDescriptionsState) super.readLastPage();
  }
}
